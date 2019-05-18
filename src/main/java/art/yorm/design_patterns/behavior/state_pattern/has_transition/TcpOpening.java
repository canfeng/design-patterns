package art.yorm.design_patterns.behavior.state_pattern.has_transition;

public class TcpOpening extends TcpState {


    @Override
    public void close(TcpConnection connection) {
        System.out.println("关闭连接");
        connection.setCurState(TcpConnection.TCP_CLOSED);
    }

    @Override
    public void ack(TcpConnection connection) {
        System.out.println("确认打开连接，通道开启，可以传输数据");
        connection.setCurState(TcpConnection.TCP_ESTABLISHED);
    }

}
