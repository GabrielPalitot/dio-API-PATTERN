package com.learning.taskManager.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;


public enum StatusTask {
    PENDING("P", "Pending"),
    IN_PROGRESS("I", "In Progress"),
    COMPLETED("C", "Completed");

    private static final Map<String, StatusTask> CODE_MAP = new HashMap<>();
    private String code;
    private String description;

    static {
        for (StatusTask status : StatusTask.values()) {
            CODE_MAP.put(status.code.toUpperCase(), status);
        }
    }

    private StatusTask(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static StatusTask getTaskByCode(String code) {
        return CODE_MAP.get(code.toUpperCase());
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
