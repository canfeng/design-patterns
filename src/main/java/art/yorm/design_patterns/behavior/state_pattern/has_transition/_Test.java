package art.yorm.design_patterns.behavior.state_pattern.has_transition;

/**
 * 状态模式
 * 有状态间转换的
 */
public class _Test {
    public static void main(String[] args) {

        TcpConnection connection = new TcpConnection(TcpConnection.TCP_CLOSED);
        connection.ack();
        connection.open();
        connection.ack();
        connection.transmit("hello szg");
        connection.close();
        connection.close();
    }
}
