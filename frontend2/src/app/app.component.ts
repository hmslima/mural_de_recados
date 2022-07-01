import { Component } from '@angular/core';
import { RecadosService } from './recados.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  osRecados: any;

  constructor(private recadoDados : RecadosService) {

    this.recadoDados.getRecados().subscribe(dados=>{
      this.osRecados=dados._embedded.recadoes;
    });
  }

  postRecado(dados:any) {
    this.recadoDados.saveRecado(dados).subscribe(() => window.location.reload());
  }
}
