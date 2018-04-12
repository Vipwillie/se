package workflow;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/4/10 16:41</p>
 */
public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        if ("同意".equals(lrm.getResult())) {
            if (lrm.getLeaveDays() > 3) {
                //如果请假天数大于3天，而且项目经理同意了，就提交给部门经理
                request.setState(new DepManagerState());
                //为部门经理增加一个工作
            } else {
                //3天以内的请假，由项目经理做主
                //就不用提交部门经理了转向审核结束状态
                request.setState(new AuditOverState());
            }
        } else {//项目经理不同意的话，也就不用提交给部门经理了,转向审核结束状态
            request.setState(new AuditOverState());
        }
    }
}
