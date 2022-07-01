import { TestBed } from '@angular/core/testing';

import { RecadosService } from './recados.service';

describe('RecadosService', () => {
  let service: RecadosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RecadosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
