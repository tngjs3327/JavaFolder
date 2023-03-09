package Professor;

import java.io.IOException;
import java.io.*;
import java.nio.file.*;
import java.util.*;

import Professor.*;

public class TeamGen {
    public static void main(String[] args) {
        try {
            // 현재 디렉토리의 경로 확인하기
            String currentPath = new File(".").getCanonicalPath();
            System.out.println("현재 디렉토리:" + currentPath);
            // 위의 현재 디렉토리에 조편성.txt 파일을 가져다 놓는다.
            // 조편성.txt 파일 내용은 다음과 같은 형식
            // A:101,A:102,A:103,A:104,A:105,A:106,.....,F:131,F:132,F:133,F:134,F:135,F:136

            // 파일에서 모든 내용을 읽어들인다.
            List<String> list = Files.readAllLines(Paths.get("./조편성.txt"));
            StringBuffer sb = new StringBuffer();
            // 파일의 내용을 담고 있는 list의 각 원소를 모두 합쳐 문자열로 변환하기 위해 StringBuffer에 추가한다.
            for (String s : list) {
                sb.append(s);
            }
            // 파일에서 읽어들인 내용을 문자열로 변환해 저장
            String content = sb.toString();
            // 쉼표를 기준으로 content의 내용을 토큰으로 분리한다.
            StringTokenizer st = new StringTokenizer(content, ",");

            // 성적에 따라 나눈 그룹(A, B, C, ...)를 key로, 그 그룹에 속한 학생들 이름(또는 학번)의 List를 값으로 map에 저장
            HashMap<String, List<String>> map = new HashMap<>();
            // 모든 토큰들을 처리할 때까지 반복한다.
            while (st.hasMoreElements()) {
                String token = st.nextToken();
                // token은 A:XXX의 형태, A는 성적에 따라 나눈 그룹이고 XXX는 이름이거나 번호
                String group = token.substring(0, 1);
                String name = token.substring(2);
                // 그 그룹을 키로 하는 값이 존재하는지 확인한다.
                List<String> members = map.get(group);
                // 그 키에 해당하는 값이 없으면 즉, 그 그룹의 첫번째 멤버이면 새로은 리스트를 생성한다.
                if (members == null) {
                    members = new ArrayList<>();
                    map.put(group, members);
                }
                members.add(name);
            }
            // map의 상태를 확인해본다.
            // System.out.println(map);
            makeTeams(map, 6);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    // map에 있는 키의 수만큼 팀을 만든다.
    // 그룹별 멤버리스트를 포함한 map과, 한 팀에 들어갈 최대 인원수를 인자로 받는다.
    private static void makeTeams(HashMap<String, List<String>> map, int maxNumOfMembers) {
        List<List<String>> teams = new ArrayList<>();

        int teamNo = 0;
        int totalTeams = map.keySet().size(); // key의 수만큼 팀생성
        while (true) {
            // 그룹 집합
            Set<String> groups = map.keySet();

            // 그룹 집합의 각 그룹을 처리한다.
            Iterator<String> iter = groups.iterator();

            // 각 그룹에서 차출할 멤버 번호를 무작위로 결정하기 위해 random 객체 사용
            Random rand = new Random(System.currentTimeMillis());
            // teamNo번째 팀을 위핸 List 객체 생성
            teams.add(new ArrayList<>());

            int num = 0;
            while (iter.hasNext()) {
                String group = iter.next();
                List<String> members = map.get(group);
                String member = null;
                try {
                    // 팀 생성에 추출할 멤버 결정
                    num = rand.nextInt(maxNumOfMembers);
                    member = members.remove(num);
                } catch (IndexOutOfBoundsException ignore) {
                }
                ;
                if (member != null)
                    teams.get(teamNo).add(member);
            }
            if (++teamNo >= totalTeams) {
                break;
            }
            maxNumOfMembers--; // 무작위로 생성할 멤버번호의 상한선을 1 감소 시킨다.
        }

        // System.out.println(teams);
        // 만들어진 팀의 멤버들을 출력한다.
        for (int i = 0; i < teams.size(); i++) {
            List<String> team = teams.get(i);
            System.out.println((i + 1) + "조");
            for (int j = 0; j < team.size(); j++) {
                System.out.println(team.get(j) + " ");
            }
            System.out.println();
        }
    }
}
