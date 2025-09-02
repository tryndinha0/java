import { Component, ViewChild, AfterViewInit } from '@angular/core';
import { ProductService } from '../services/product';
import { Product } from '../models/product.models';
import { CommonModule } from '@angular/common';
import { FormControl, ReactiveFormsModule } from '@angular/forms';
import { merge } from 'rxjs';
import { debounceTime, distinctUntilChanged } from 'rxjs/operators';

import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatPaginator, MatPaginatorModule, PageEvent } from '@angular/material/paginator';
import { MatSort, MatSortModule } from '@angular/material/sort';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatProgressBarModule } from '@angular/material/progress-bar';

import { ProductFormComponent } from '../product-form/product-form';
import { ConfirmDialogComponent } from '../confirm-dialog/confirm-dialog';
import { ProductListParams } from '../interfaces/IProduct';
import { NgxMaskDirective } from 'ngx-mask';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatButtonModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatToolbarModule,
    MatProgressBarModule,
    NgxMaskDirective  
  ],
  templateUrl: './product-list.html',
  styleUrls: ['./product-list.scss']
})
export class ProductListComponent implements AfterViewInit {
  displayedColumns: string[] = ['id', 'name', 'price', 'quantity', 'actions'];
  dataSource = new MatTableDataSource<Product>();
  filterControl = new FormControl('');
  totalElements = 0;
  isLoading = false;
  sortActive = 'id'; // Valor padrão para ordenação
  sortDirection: 'asc' | 'desc' = 'asc'; // Valor padrão para direção

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(
    private productService: ProductService,
    private dialog: MatDialog,
    private snackBar: MatSnackBar
  ) { }

  ngAfterViewInit() {
    if (this.sort) {
      this.sort.active = this.sortActive;
      this.sort.direction = this.sortDirection;
    }

    let lastPageSize = this.paginator.pageSize;

    merge(
      this.sort.sortChange,
      this.paginator.page,
      this.filterControl.valueChanges.pipe(
        debounceTime(500),
        distinctUntilChanged()
      )
    ).subscribe(() => {
      if (this.paginator.pageSize !== lastPageSize) {
        this.paginator.pageIndex = 0;
        lastPageSize = this.paginator.pageSize;
      }

      this.loadProducts();
    });

    this.loadProducts();
  }


  loadProducts(): void {
    this.isLoading = true;

    const active = this.sort?.active || this.sortActive;
    const direction = this.sort?.direction || this.sortDirection;

    const params: ProductListParams = {
      page: this.paginator.pageIndex,
      size: this.paginator.pageSize,
      sort: `${active},${direction}`,
      name: this.filterControl.value || undefined
    };

    this.productService.getProducts(params).subscribe({
      next: response => {
        this.dataSource.data = response.content;
        this.totalElements = response.totalElements;
        this.isLoading = false;
      },
      error: () => {
        this.isLoading = false;
        this.snackBar.open('Erro ao carregar produtos', 'Fechar', { duration: 3000 });
      }
    });
  }

  openProductForm(product?: Product): void {
    const dialogRef = this.dialog.open(ProductFormComponent, {
      width: '500px',
      data: product
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.refreshData();
        this.snackBar.open(`Produto ${product ? 'atualizado' : 'criado'} com sucesso!`, 'Fechar', { duration: 3000 });
      }
    });
  }

  confirmDeleteProduct(id: number): void {
    const dialogRef = this.dialog.open(ConfirmDialogComponent, {
      width: '300px',
      data: {
        title: 'Confirmar Exclusão',
        message: 'Tem certeza que deseja excluir este produto?'
      }
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.productService.deleteProduct(id).subscribe({
          next: () => {
            this.refreshData();
            this.snackBar.open('Produto excluído com sucesso!', 'Fechar', { duration: 3000 });
          },
          error: () => {
            this.snackBar.open('Erro ao excluir produto', 'Fechar', { duration: 3000 });
          }
        });
      }
    });
  }

  private refreshData(): void {
    const params: ProductListParams = {
      page: this.paginator.pageIndex,
      size: this.paginator.pageSize,
      sort: `${this.sort.active},${this.sort.direction}`,
      name: this.filterControl.value || undefined
    };

    this.productService.getProducts(params).subscribe({
      next: response => {
        this.dataSource.data = response.content;
        this.totalElements = response.totalElements;
      }
    });
  }
}