import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product} from '../models/product.models';
import { ProductListParams } from '../interfaces/IProduct';


@Injectable({
  providedIn: 'root'
})
export class ProductService { 
  private apiUrl = 'http://localhost:8080/api/products';

  constructor(private http: HttpClient) { }

 getProducts(params: ProductListParams): Observable<any> {
    let httpParams = new HttpParams()
      .set('page', params.page)
      .set('size', params.size)
      .set('sort', params.sort);

    if (params.name) {
      httpParams = httpParams.set('name', params.name);
    }

    return this.http.get<any>(this.apiUrl, { params: httpParams });
  }

  getProductById(id: number): Observable<Product> {
    return this.http.get<Product>(`${this.apiUrl}/${id}`);
  }

  createProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(this.apiUrl, product);
  }

  updateProduct(id: number, product: Product): Observable<Product> {
    return this.http.put<Product>(`${this.apiUrl}/${id}`, product);
  }

  deleteProduct(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}