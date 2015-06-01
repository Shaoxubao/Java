package com.msm.constants;

public enum UserPosition {

    ADMIN_MANAGE(0, "管理员"),          // 管理员

    PRODUCT_CHECK_REG(1, "检品登记"),    // 检品登记人员

    PRODUCT_INSPECT(2, "检品检验"),      // 检验人员

    QUALITY_MANAGE(3, "质保科管理"),      // 质保科管理人员

    LOGISTICS_PERSONNEL(4, "后勤保障"),  // 后勤保障人员

    REPORT_PRINT(5, "报告打印");         // 报告打印人员

    private final int value;
    private final String desc;

    private UserPosition(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int value() {
        return this.value;
    }

    public String desc() {
        return this.desc;
    }

}
