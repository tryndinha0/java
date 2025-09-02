import { ApplicationConfig } from '@angular/core';
import { provideAnimations } from '@angular/platform-browser/animations'; 
import { provideHttpClient } from '@angular/common/http'; 
import { provideNgxMask } from 'ngx-mask';


export const appConfig: ApplicationConfig = {
  providers: [
    provideNgxMask(),
    provideAnimations(), 
    provideHttpClient(),
  ]
};