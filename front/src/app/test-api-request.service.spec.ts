import { TestBed } from '@angular/core/testing';

import { TestApiRequestService } from './test-api-request.service';

describe('TestApiRequestService', () => {
  let service: TestApiRequestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TestApiRequestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
