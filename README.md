# Database
database
jar 파일 2개(mongo-java-driver , mysql-connector) 작성중이신 자바 프로젝트의 bin 폴더 내에 위치시키고, 다음과 같은 방식으로 드라이버 파일을 추가하시면 됩니다.

<<IntelliJ에서 프로젝트에 MongoDB와 MySQL 드라이버 JAR 파일을 추가하는 방법은 다음과 같습니다.

1. 프로젝트에 JAR 파일 직접 추가하기
JAR 파일 다운로드:

MongoDB Java Driver와 MySQL Connector/J를 각각 다운로드합니다.(제가 첨부한 JAR 파일 2개입니다.)
프로젝트에 라이브러리 추가:

**프로젝트 탐색기(Project Explorer)**에서 프로젝트를 마우스 오른쪽 버튼으로 클릭하고, Open Module Settings를 선택합니다. (또는 F4 키를 누릅니다)
Modules 섹션에서 왼쪽 메뉴에서 프로젝트 모듈을 선택하고, Dependencies 탭으로 이동합니다.
오른쪽에 있는 + 버튼을 클릭하고, JARs or directories를 선택합니다.
다운로드한 MongoDB와 MySQL JAR 파일을 선택하고 OK를 클릭합니다.
추가된 라이브러리의 Scope가 Compile로 설정되어 있는지 확인한 후 Apply를 클릭합니다.
프로젝트 빌드:

이제 프로젝트를 다시 빌드하고, MongoDB와 MySQL 관련 코드를 문제없이 사용할 수 있습니다.>>

2. 프로젝트에 제가 첨부한 DataBase 패키지 import 해주시고 MongoDBConnector, MySQLConnector, ConnectionTest 클래스 저장 후 ConnectionTest 클래스 실행시켜서
콘솔에 각 DB마다 정상적으로 연결되는지 확인해주시면 됩니다.

3. 정상적으로 연결되는거 확인하시면 ConnectionTest 클래스 삭제하셔도 되고, 이후 개발에 MongoDBConnector 및 MySQLConnector 객체 호출하시어 메소드 작성하시면 됩니다.

4. 각 DB에 저장되는 데이터는 다음과 같습니다.
   MongoDB: chat(채팅) - 송신자, 수신자, 채팅내용, 현재시간
            post(게시물) - 작성자, 내용, 작성시간, (추천수?)

   MySQL : user(사용자) - 
           friend(친구) -
           board(게시판) -
           server(서버) -         
