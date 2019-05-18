package art.yorm.design_patterns.behavior.state_pattern.has_transition;

public class TcpEstablished extends TcpState {

    @Override
    public void close(TcpConnection connection) {
        System.out.println("关闭连接");
        connection.setCurState(TcpConnection.TCP_CLOSED);
    }

    @Override
    public void transmit(TcpConnection connection, String msg) {
        System.out.println("发送TCP报文...");
    }
}
