import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RotaChildComponent } from './rota-child.component';

describe('RotaChildComponent', () => {
  let component: RotaChildComponent;
  let fixture: ComponentFixture<RotaChildComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RotaChildComponent]
    });
    fixture = TestBed.createComponent(RotaChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
