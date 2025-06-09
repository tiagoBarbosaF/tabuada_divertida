import { Component, inject, OnInit } from '@angular/core';
import { DesafioService } from '../services/desafio-service';
import { Desafio } from '../model/desafio.model';

@Component({
  selector: 'app-spa-tabuada',
  imports: [],
  templateUrl: './spa-tabuada.html',
  styleUrl: './spa-tabuada.css'
})
export class SpaTabuada implements OnInit {

  private desafioService = inject(DesafioService);

  desafio?: Desafio;

  ngOnInit() {
    this.getNovoDesafio();
  }

  getNovoDesafio() {
    this.desafioService.getDesafio().subscribe((res) => {
      console.log(res);
      this.desafio = res;
    })
  }
}
