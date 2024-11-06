package DataBase;
/*
이 클래스는 단순히 다른 환경에서 MongoDB와 MySQL의 연결이 정상적으로 되는지 확인하기 위한 클래스입니다.
추후 안정적인 연결이 확인되어 작업에 지장이 없으면 삭제하셔도 좋습니다.
*/
public class ConnectionTest {

    public static void main(String[] args) {
        // MongoDB 연결 테스트
        try {
            MongoDBConnector mongoConnector = new MongoDBConnector();
            if (mongoConnector.getCollection("test") != null) { // 테스트 컬렉션을 임시로 가져와 확인
                System.out.println("MongoDB에 성공적으로 연결되었습니다.");
            }
        } catch (Exception e) {
            System.out.println("MongoDB 연결 테스트 중 오류가 발생했습니다: " + e.getMessage());
        }

        // MySQL 연결 테스트
        try {
            MySQLDBConnector mySQLConnector = new MySQLDBConnector();
            if (mySQLConnector.getConnection() != null && !mySQLConnector.getConnection().isClosed()) {
                System.out.println("MySQL에 성공적으로 연결되었습니다.");
            }
            mySQLConnector.closeConnection(); // 연결 종료
        } catch (Exception e) {
            System.out.println("MySQL 연결 테스트 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
