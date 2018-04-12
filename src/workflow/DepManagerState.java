package workflow;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 16:47</p>
 */
public class DepManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        //业务模型
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        //业务处理
        //......
        //部门经理审核以后，直接转向审核结束状态了
        request.setState(new AuditOverState());
        //给申请人增加一个工作，让他查看审核结果
    }
}
