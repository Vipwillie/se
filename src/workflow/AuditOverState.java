package workflow;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 16:49</p>
 */
public class AuditOverState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        //业务模型对象
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        //业务处理，在数据中记录整个流程结束
    }
}
