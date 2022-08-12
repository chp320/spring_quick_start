1. 일반적으로 시스템을 두 개의 레이어로 표현한다면 Presentation Layer, Business Layer 로 구분 가능하다.
   - 비즈니스 레이어는 Service interface, ServiceImpl, DAO, VO
   - 프리젠테이션 레이어는 DispatcherServlet, View(JSP), Controller

2. VO(Value Object) 클래스는 레이어와 레이어 사이에서 관련된 데이터를 한꺼번에 주고받을 목적으로 사용하는 클래스이다.
   DTO(Data Transfer Object)라 하기도 하며, 데이터 전달을 목적으로 사용하는 객체이므로 결국 같은 의미이다.