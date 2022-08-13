1. 일반적으로 시스템을 두 개의 레이어로 표현한다면 Presentation Layer, Business Layer 로 구분 가능하다.
   - 비즈니스 레이어는 Service interface, ServiceImpl, DAO, VO
   - 프리젠테이션 레이어는 DispatcherServlet, View(JSP), Controller

2. VO(Value Object) 클래스는 레이어와 레이어 사이에서 관련된 데이터를 한꺼번에 주고받을 목적으로 사용하는 클래스이다.
   DTO(Data Transfer Object)라 하기도 하며, 데이터 전달을 목적으로 사용하는 객체이므로 결국 같은 의미이다.

3. DAO(Data Access Object) 클래스는 데이터베이스 연동을 담당하는 클래스이다.
   따라서 DAO 클래스에는 CRUD(create, read, update, delete) 기능의 메서드가 구현되어야 한다. -> 데이터베이스 접속을 위해 jdbc 드라이버 필요!
   - MyBatis 프레임워크 사용 전까지 데이터베이스 연동은 jdbc로 처리 예정
   - 모든 DAO 클래스에서 공통으로 사용할 jdbcUtil 클래스를 통해 connection 및 해제 작업을 공통으로 처리!

※ 스프링 컨테이너가 해당 클래스 객체를 생성할 수 있도록 어노테이션을 사용할 수 있다.
어노테이션       위치                      의미
@Service    XXXServiceImpl  비즈니스 로직을 처리하는 Service 클래스
@Repository XXXDAO          데이터베이스 연동을 처리하는 DAO 클래스 (DB 연동 과정에서 발생하는 예외를 변환하는 기능 존재)
@Controller XXXController   사용자 요청을 제어하는 Controller 클래스 (MVC 아키텍처에서 컨트롤러 객체로 인삭하게 함)

----------------------------------------------------------------------------------------------------------------------------

1. 스프링 AOP
   - 비즈니스 컴포넌트 개발에서 중요한 원칙 : "낮은 결합도, 높은 응집도"
   - 스프링의 의존성 주입(DI, Dependency Injection)을 이용하면 객체들의 결합도를 떨어뜨릴 수 있어 의존관계를 쉽게 변경 가능
   - 스프링이 IoC가 결합도와 관련된 기능이라면, AOP(Aspect Oriented Programming)는 응집도와 관련된 기능

2. AOP 이해하기
   - 중요 핵심 : "관심 분리(Separation of Concerns)"
   - 횡단 관심(Crosscutting Concerns) : 메서드마다 공통으로 등장하는 로깅이나 예외, 트랜잭션 처리 같은 코드들
   - 핵심 관심(Core Concerns) : 사용자 요청에 따라 실제로 수행되는 핵심 비즈니스 로직