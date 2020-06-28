package Exercise;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public enum WeekDayEnum {
        MONDAY(1,"周一"),
        TUESDAY(2, "周二"),
        WEDNESDAY(3, "周三"),
        THURSDAY(4, "周四"),
        FRIDAY(5, "周五"),
        SATURDAY(6, "周六"),
        SUNDAY(7, "周日");

        private int code;
        private String desc;

        WeekDayEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        private static final Map<Integer, WeekDayEnum> WEEK_ENUM_MAP = new HashMap<Integer, WeekDayEnum>();

        // 对map进行初始化
        static {
            for (WeekDayEnum weekDay : WeekDayEnum.values()) {
                WEEK_ENUM_MAP.put(weekDay.getCode(), weekDay);
            }
        }

        public static WeekDayEnum findByCode(int code) {
            return WEEK_ENUM_MAP.get(code);
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public static void main(String[] args) {
        System.out.println(WeekDayEnum.findByCode(1));

        Map<String,Integer> map=new HashMap<>();
        synchronized (Demo4.class){
            map.put("aa",1);
            map.put("bb",1);
        }
        System.out.println(map.toString());
    }
}
