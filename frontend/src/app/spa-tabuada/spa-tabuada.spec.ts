import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpaTabuada } from './spa-tabuada';

describe('SpaTabuada', () => {
  let component: SpaTabuada;
  let fixture: ComponentFixture<SpaTabuada>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SpaTabuada]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SpaTabuada);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
