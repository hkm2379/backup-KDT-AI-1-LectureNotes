package writer;

public class DiceProb3 {
    public static void main(String[] args) {

        // 조건: 항상 먼저해야 하는 작업은 이런식으로 문제의 조건들을 분리하는 것입니다.

        // 친구와 1:1 게임
        // 주사위 3개
        // 첫 번째 주사위가 짝수면 나머지 2개를 굴릴 수 있음
        // 세 번째 주사위는 특수 기능이 존재함
        // 숫자가 1이면 친구에게 3점 훔치기 (추후 광역 공격)
        // 숫자가 3이면 자가 버프 2점
        // 숫자가 4라면 무조건 패배

        // 문제의 조건들을 다 분리 했더니 위의 케이스들은 너무 세부사항입니다.
        // 조건은 정말 저 조건들을 실제 구현해야 하는 상황이 되었을 때 처리합시다.
        // 지금은 관심사를 세부사항이 아닌 전체 흐름을 잡는것에 집중하도록 합니다.
        // 그러므로 일단 잠시 보류하고 게임을 만들어야 합니다.

        // 테스트를 만들 때도 이런 개념으로 만들면서 점진적 확장을 시작하면 됩니다.
        // 1. 게임 객체() 생성
        // 2. 게임객체.게임플레이()
        // 3. 게임객체.승자판정()

        // 우선 게임 객체 생성자에서 뭐 필요한가? 모르겠네
        // 2번의 게임플레이() 를 만들어보자!
        // 일단 플레이어가 주사위를 굴려야겠네?
        // 이 상태에서 진행하려고 했더니 플레이어와 주사위가 없네?
        // [1] 초기에 셋팅할까? <- 생성자인 1번에 필요한 것들을 배치
        // [2] 그냥 여기에 다 때려박을까? <- 2번 흐름에서 필요한 정보를 배치

        // 둘 중 무엇을 선택하던 플레이어를 만들게 됩니다.
        // 어쩌다 보면 주사위도 만들 수 있습니다 -> 이것도 OK

        // * 주사위를 굴립니다.

        // 2번에서 주요한 역할인 주사위 굴리기가 끝났으니까
        // 3번에 해당하는 승자 판정을 시작해보려고 합니다.

        // 플레이어들이 뽑은 주사위 값을 비교합니다.
        // 비교해서 큰 놈을 승자로 판정합니다.
        // 돌려서 결과가 잘 나오는지 확인합니다.

        // 근데 돌려보니까 뭔가 이상한게 느껴지겠죠.
        // 이 때 가서 내가 조건에서 뭔가 빠뜨린게 있나? 를 생각해봅니다.

        // 그러고 보니 이런 조건이 있었네 ?
        // [첫 번째 주사위가 짝수면 나머지 2개를 굴릴 수 있음]

        // 주사위 굴리는 부분에 첫 번째 주사위가
        // 짝수로 판정되는 경우에만 나머지 2개를 돌리도록 코드를 변경하자!

        // 다시 구동합니다.
        // 짝수인 경우에만 잘 나오는지 확인합니다.
        // 그리고 승자 판정도 잘 동작하는지 확인합니다.

        // 오 좋은데 ? 근데 뭔가 이상한데 ?
        // 조건을 다시 보니까 특수 기능이 동작하지 않는 것을 확인했습니다.
        // 아래와 같은 특수 기능들이 존재하고 있었습니다.

        // [ 숫자가 1이면 친구에게 3점 훔치기 (추후 광역 공격) ]
        // [ 숫자가 3이면 자가 버프 2점 ]
        // [ 숫자가 4라면 무조건 패배 ]

        // 일단 세 번째 주사위의 숫자를 확인합니다.
        // system.out,println()에 찍어서 잘 나오나 확인해 봅시다.
        // 잘 되는 것 같았는데 갑자기 에러가 튀어나오네요 ?
        // 아마도 에러 메세지를 읽어보면 NullPointerException
        // 혹은 index OutOfBound 같은 것에 해당할 것입니다.

        // 왜 안나오는거야?
        // 살펴보니까 아 두 번째와 세 번째 주사위가 안나올 수 있었네?
        // 이 부분을 고려하지 않았구나!
        // 예외처리 추가해야겠네!
        // 세 번째 주사위 숫자를 확인하기 전에
        // 해당 주사위가 존재하는지 먼저 확인해야겠구나!

        // 실제 읽은 숫자가 어떤 조건에 대응하는지 살펴봐야합니다.
        // 우선 숫자 4번부터 보기로 했으니까 사망 판정부터 때립시다.

        // 주사위 숫자를 더하다보면 음수가 나올 수 없으니까 그냥 음수값 큰거 주자!
        // 숫자가 4가 나오면 사용자 점수에 대략 -777 점 같은 형태로 점수를 줍니다.
        // 여기까지 처리하고 실제 숫자 4가 나올때 패배 처리가 되는지 확인합니다.

        // [ 숫자가 3이면 자가 버프 2점 ]
        // 이제 다음으로 만만한 자가 버프를 해봅시다.
        // 세 번째 주사위 숫자 3을 확인하면 자신의 점수에 2점을 추가해줍니다.
        // 이후 다시 돌려서 3이 나왔을때 2점이 추가되는지 확인합니다.
        // 그 와 동시에 숫자 4에 대한 패배 처리도 확인합니다.

        // [ 숫자가 1이면 친구에게 3점 훔치기 (추후 광역 공격) ]
        // 이제 마지막으로 세 번째 주사위 숫자가 1인 경우를 체크합니다.
        // 여기서는 상대편의 값을 훔쳐오기 때문에
        // 상대편을 파악할 수 있어야 합니다.
        // 현재 내 상태를 기반으로 상대를 파악할 수 있는 코드를 하나 작성합니다.
        // 그리고 잘 가져왔는지 system.out,println()으로 출력해서 확인해봅니다.

        // 이제 상대편을 파악 했으니까 상대편 점수에서 3점을 가져와서 상대편의 점수를 갱신합니다.
        // 그리고 상대편에게 뺏어서 자신에게 가져오는 것이므로
        // 3점을 자기 자신에게 더해서 갱신합니다.
        // 최종적으로 숫자 1, 3, 4에 대한 모든 처리가 잘 동작하는지 확인합니다.

        // 만약 과정 중간에 문제가 발생한다면
        // 문제의 원인을 파악해서 점진적으로 개선합니다.
    }
}
