package iufc.cn.activiti.amqp;

import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * 执行对象值对象
 * Created by cyq on 2017/10/19.
 */
public class ExecutionVO {
    private static final int ACTIVE = 1;//活动的
    private static final int SUSPENDED = 2;//暂停的(挂起的)

    private String tenantId;
    private String name;
    private String description;
    private String localizedName;
    private String localizedDescription;
    private Date lockTime;
    private boolean isActive = true;//是否活动
    private boolean isScope = true;//是否全局的
    private boolean isConcurrent = false;//是否并发
    private boolean isEnded = false;
    private boolean isEventScope = false;
    private String eventName;//事件名称
    private int executionListenerIndex = 0;
    private int cachedEntityState;
    private boolean deleteRoot;
    private String deleteReason;
    private boolean isOperating = false;
    private int revision = 1;
    private int suspensionState = ACTIVE;
    private String processDefinitionId;//流程定义Id
    private String processDefinitionKey;//流程定义key
    private String processDefinitionName;
    private Integer processDefinitionVersion;
    private String deploymentId;
    private String activityId;//环节Id
    private String activityName;
    private String processInstanceId;//流程实例Id
    private String businessKey;//业务Id
    private String parentId;
    private String superExecutionId;
    private boolean forcedUpdate;


    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getLocalizedDescription() {
        return localizedDescription;
    }

    public void setLocalizedDescription(String localizedDescription) {
        this.localizedDescription = localizedDescription;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isScope() {
        return isScope;
    }

    public void setScope(boolean scope) {
        isScope = scope;
    }

    public boolean isConcurrent() {
        return isConcurrent;
    }

    public void setConcurrent(boolean concurrent) {
        isConcurrent = concurrent;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public void setEnded(boolean ended) {
        isEnded = ended;
    }

    public boolean isEventScope() {
        return isEventScope;
    }

    public void setEventScope(boolean eventScope) {
        isEventScope = eventScope;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getExecutionListenerIndex() {
        return executionListenerIndex;
    }

    public void setExecutionListenerIndex(int executionListenerIndex) {
        this.executionListenerIndex = executionListenerIndex;
    }

    public int getCachedEntityState() {
        return cachedEntityState;
    }

    public void setCachedEntityState(int cachedEntityState) {
        this.cachedEntityState = cachedEntityState;
    }

    public boolean isDeleteRoot() {
        return deleteRoot;
    }

    public void setDeleteRoot(boolean deleteRoot) {
        this.deleteRoot = deleteRoot;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public boolean isOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public int getSuspensionState() {
        return suspensionState;
    }

    public void setSuspensionState(int suspensionState) {
        this.suspensionState = suspensionState;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getProcessDefinitionName() {
        return processDefinitionName;
    }

    public void setProcessDefinitionName(String processDefinitionName) {
        this.processDefinitionName = processDefinitionName;
    }

    public Integer getProcessDefinitionVersion() {
        return processDefinitionVersion;
    }

    public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
        this.processDefinitionVersion = processDefinitionVersion;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSuperExecutionId() {
        return superExecutionId;
    }

    public void setSuperExecutionId(String superExecutionId) {
        this.superExecutionId = superExecutionId;
    }

    public boolean isForcedUpdate() {
        return forcedUpdate;
    }

    public void setForcedUpdate(boolean forcedUpdate) {
        this.forcedUpdate = forcedUpdate;
    }
}
