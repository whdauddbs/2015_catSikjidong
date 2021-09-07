# 가대 식지동
2015년 12월 COMA에서 신입생끼리 제작한 안드로이드 애플리케이션
프로그래밍을 처음하는 학생들끼리 모여서 만들었기 때문에 코드 퀄리티가 매우 저조하며,
6년 전 방식의 안드로이드 프레임워크이기 때문에, 코드가 이상한 것들이 많다.(View 아이디 직접 참조라던가..)

실제로 구현했던 코드는 2015년에 작성 후 오랜시간이 지나 찾을 수 없기 때문에,
남아있던 디버그 apk 파일을 디컴파일 하여 보이는 내부 코드를 새 프로젝트를 만들어 붙여 넣었다.

지금와서 보니 왜 이렇게 짰나... 싶다. 하지만 그때는 프로그래밍을 접한지 몇달 되지도 않았다는 것을 감안해야한다.
아는게 for, if문 밖에 없고 자바는 배운적도 없어서 검색을 통해 어떻게든 돌아는 가게 만들었었다.

현재 apk파일은 지원하는 안드로이드 버전이 매우 낮고, 반응성이 고려되지 않은 상태이다.
코드를 살짝 고쳐서 2021년에 돌아는 가게 만들기..

내부의 리소스는 바꾸지 않을 것이기 때문에, 현재 없는 가게들고 많고 가격도 매우 다르다.

[이전코드](https://github.com/whdauddbs/2015_catSikjidong/commit/53fb6738652e8e1cd03c359202e6b07ed5c7ddc0) /  
[변경 후 코드](https://github.com/whdauddbs/2015_catSikjidong/commit/c1cddf676a17476ab78195a521294722d9f3d2da)

### 주요 변경 사항
1. java -> kotlin
2. ViewBinding 사용
3. 전반적인 변수명 및 리소스명 변경
4. 자료구조 사용
5. 수많은 분기 처리 정리
6. LinearLayout -> ConstraintLayout으로 변경하여 여러 해상도 대응
