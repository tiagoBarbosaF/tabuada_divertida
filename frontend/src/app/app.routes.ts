import { Routes } from '@angular/router';
import { SpaTabuada } from './spa-tabuada/spa-tabuada';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'tabuada',
    pathMatch: 'full',
  },
  {
    path: 'tabuada',
    component: SpaTabuada
  }
];
