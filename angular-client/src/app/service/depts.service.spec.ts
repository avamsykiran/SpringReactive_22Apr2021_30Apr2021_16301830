import { TestBed } from '@angular/core/testing';

import { DeptsService } from './depts.service';

describe('DeptsService', () => {
  let service: DeptsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeptsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
