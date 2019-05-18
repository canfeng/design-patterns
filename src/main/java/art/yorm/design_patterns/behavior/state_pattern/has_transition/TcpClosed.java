package art.yorm.design_patterns.behavior.state_pattern.has_transition;

public class TcpClosed extends TcpState {

    @Override
    public void open(TcpConnection connection) {
        System.out.println("打开连接");
        connection.setCurState(TcpConnection.TCP_OPENING);
    }
}
