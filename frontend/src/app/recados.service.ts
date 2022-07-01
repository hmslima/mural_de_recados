import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class RecadosService {

  url = 'http://localhost:8080/api/recados';

  constructor(private http : HttpClient) { }

  getRecados() {
    return this.http.get(this.url);
  }

  saveRecado(data:any) {
    return this.http.post(this.url, data);
  }
}
