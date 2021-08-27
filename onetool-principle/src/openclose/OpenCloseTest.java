package openclose;

public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "Java架构", 11800D);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID："+ discountCourse.getId());
        System.out.println("课程标题：《" + discountCourse.getName() + "》" );
        System.out.println("原价：" + discountCourse.getPrice() );
        System.out.println("售价：" + discountCourse.getDiscountPrice());
    }
}
