package com.zh.po;

import javax.persistence.*;

@Table(name = "apply_state")
public class ApplyState {
    @Id
    @Column(name = "apply_state_id")
    private Integer applyStateId;

    @Column(name = "apply_state_name")
    private String applyStateName;

    /**
     * @return apply_state_id
     */
    public Integer getApplyStateId() {
        return applyStateId;
    }

    /**
     * @param applyStateId
     */
    public void setApplyStateId(Integer applyStateId) {
        this.applyStateId = applyStateId;
    }

    /**
     * @return apply_state_name
     */
    public String getApplyStateName() {
        return applyStateName;
    }

    /**
     * @param applyStateName
     */
    public void setApplyStateName(String applyStateName) {
        this.applyStateName = applyStateName == null ? null : applyStateName.trim();
    }
}