

import { Component } from '@angular/core';
import { ProductListComponent } from './product-list/product-list';
import { NgxMaskDirective } from 'ngx-mask';

@Component({
  selector: 'app-root',
  imports: [
    ProductListComponent,
    NgxMaskDirective  
  ],
  standalone: true,
  templateUrl: './app.html',
  styleUrls: ['./app.scss']
})
export class App {
  title = 'Gerenciamento de Produtos';
}