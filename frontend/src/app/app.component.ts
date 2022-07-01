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
      this.osRecados=dados;
    });
  }

  postRecado(dados:any) {
    console.warn(dados);
    this.recadoDados.saveRecado(dados).subscribe(() => window.location.reload());
    //this.recadoDados.saveRecado(dados);
  }

  reloadConteudo() {
    //window.location.reload();
  }
}
