package construct;

public class MemberThis {
    String nameField;

    // this 키워드는 생략할 수 있다.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
