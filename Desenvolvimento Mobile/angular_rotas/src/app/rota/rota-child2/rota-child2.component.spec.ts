import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RotaChild2Component } from './rota-child2.component';

describe('RotaChild2Component', () => {
  let component: RotaChild2Component;
  let fixture: ComponentFixture<RotaChild2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RotaChild2Component]
    });
    fixture = TestBed.createComponent(RotaChild2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
