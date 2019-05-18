package art.yorm.design_patterns.behavior.state_pattern.has_transition;

import lombok.Data;

/**
 * TCP连接管理类，用于保存当前连接的状态，已经对连接的调用
 */
@Data
public class TcpConnection {

    public static final TcpState TCP_OPENING=new TcpOpening();
    public static final TcpState TCP_CLOSED=new TcpClosed();
    public static final TcpState TCP_ESTABLISHED=new TcpEstablished();

    private TcpState curState;

    public TcpConnection(TcpState curState) {
        this.curState = curState;
    }

    /**
     * 打开连接
     */
    public void open(){
        curState.open(this);
    }

    /**
     * 关闭连接
     */
    public void close(){
        curState.close(this);
    }

    /**
     * 确认连接
     */
    public void ack(){
        curState.ack(this);
    }

    /**
     * 发送数据
     */
    public void transmit(String msg){
        curState.transmit(this, msg);
    }
}


