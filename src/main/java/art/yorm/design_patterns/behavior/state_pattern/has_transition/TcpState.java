package art.yorm.design_patterns.behavior.state_pattern.has_transition;

import lombok.Data;

/**
 * TcpState包括三种具体状态：TcpOpening,TcpClosed,TcpEstablished，
 * 当处于TcpOpening状态时，可以调用ack()->TcpEstablished或者close()->TcpClosed
 * 当处于TcpClosed状态时，可以调用open()->TcpOpening
 * 当处于TcpEstablished状态时，可以调用transmit()->TcpOpening或者close()->TcpClosed
 */
@Data
public abstract class TcpState {

    /**
     * 打开连接
     */
    public void open(TcpConnection connection) {
        throw new RuntimeException("open is not support");
    }

    /**
     * 关闭连接
     */
    public void close(TcpConnection connection) {
        throw new RuntimeException("close is not support");
    }

    /**
     * 确认连接
     */
    public void ack(TcpConnection connection) {
        throw new RuntimeException("ack is not support");
    }

    /**
     * 发送数据
     */
    public void transmit(TcpConnection connection, String msg) {
        throw new RuntimeException("transmit not support");
    }
}
