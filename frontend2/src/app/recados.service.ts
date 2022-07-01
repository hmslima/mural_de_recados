import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RecadosService {

  url = 'http://localhost:8080/api/recados';

  constructor(private http : HttpClient) { }

  getRecados(): Observable<any> {
    return this.http.get(this.url);
  }

  saveRecado(data:any) {
    return this.http.post(this.url, data);
  }
}
