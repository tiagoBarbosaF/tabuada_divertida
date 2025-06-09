import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Desafio } from '../model/desafio.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DesafioService {

  constructor(private http: HttpClient) {
  }

  getDesafio(): Observable<Desafio> {
    return this.http.get<Desafio>('http://localhost:8080/api/desafio');
  }
}
