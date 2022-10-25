package j04_연산자;

public class Operation_5 {
    public static void main(String[] args) {
        int totalCount = 202;
        int maxPage = totalCount / 10 == 0 ? totalCount / 10 : totalCount / 10 + 1;
        // 앞에 항이 참이면 ?totalCount가  쓰이고 거짓이면 :totalCount / 10 + 1;로 쓰인다



        int page = 15;

        int startIndex = page % 5 ==0 ? page - 4 : page - (page % 5) + 1;
        int endIndex = startIndex + 4 <= maxPage ? startIndex + 4 : maxPage;

        System.out.println("page: " + page);
        System.out.println("startIndex: " + startIndex);
        System.out.println("endIndex: " + endIndex);

        String isMaxPageStr = page == endIndex ? "마지막 인덱스입니다. " : "미자믹 인덱스가 아닙니다. ";
        //앞 page = endIndex값이 조건
        System.out.println(isMaxPageStr);
    }
}
