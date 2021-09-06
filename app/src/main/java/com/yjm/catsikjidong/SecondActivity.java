package com.yjm.catsikjidong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView = (ImageView) findViewById(R.id.img1);
        Intent intent = getIntent();
        TextView textView1 = (TextView) findViewById(R.id.txt1);
        TextView textView2 = (TextView) findViewById(R.id.txt2);
        int j = intent.getIntExtra("food", 0);
        int k = intent.getIntExtra("price", 0);
        int m = (int) (Math.random() * 10.0D % 4.0D);
        int[][] arrayOfInt = new int[5][20];
        int i;
        for (i = 0; i < 5; i++) {
            for (int n = 0; n < 20; n++) {
                (new char[5])[0] = 'k';
                (new char[5])[1] = 'c';
                (new char[5])[2] = 'j';
                (new char[5])[3] = 'w';
                (new char[5])[4] = 'e';
                arrayOfInt[i][n] = getResources().getIdentifier((new char[5])[i] + "_" + (n + 1), "drawable", getPackageName());
            }
        }
        i = k * 4 + m;
        imageView.setImageResource(arrayOfInt[j][i]);
        if (j == 0 && ++i == 1) {
            textView1.setText("꼬밥 믹스컵밥 2500원");
            return;
        }
        if (j == 0 && i == 2) {
            textView1.setText(" 꼬밥 스팸컵밥 3000원");
            return;
        }
        if (j == 0 && i == 3) {
            textView1.setText("봉구스밥버거 봉구스밥버거 1800원");
            return;
        }
        if (j == 0 && i == 4) {
            textView1.setText(" 지지고 나이스라이스 3000원");
            return;
        }
        if (j == 0 && i == 5) {
            textView1.setText("복사골뼈다귀해장국 뼈해장국 5000원");
            return;
        }
        if (j == 0 && i == 6) {
            textView1.setText(" 송이식당 할머니찌개 5000원");
            textView2.setText("가대학생은000원");
            return;
        }
        if (j == 0 && i == 7) {
            textView1.setText(" 청진동해장국 뼈해장국 5000원");
            return;
        }
        if (j == 0 && i == 8) {
            textView1.setText("홍천식당 제육 5000원");
            return;
        }
        if (j == 0 && i == 9) {
            textView1.setText(" 만득이네 두루치기 6000원");
            textView2.setText("점심은000원");
            return;
        }
        if (j == 0 && i == 10) {
            textView1.setText(" 만득이네 파불고기 6000원");
            textView2.setText("점심은000원");
            return;
        }
        if (j == 0 && i == 11) {
            textView1.setText(" 바다양푼이동태탕 양푼이동태탕 6000원");
            return;
        }
        if (j == 0 && i == 12) {
            textView1.setText("삼복냉면 삼복물냉면 6000원");
            return;
        }
        if (j == 0 && i == 13) {
            textView1.setText(" 불꾸덩이 소금구이연탄삼겹살 1인분000원");
            textView2.setText("최소인분6000원");
            return;
        }
        if (j == 0 && i == 14) {
            textView1.setText(" 오쭈 쭈꾸미 9000원");
            return;
        }
        if (j == 0 && i == 15) {
            textView1.setText("육의전 생삼겹살 9000원");
            return;
        }
        if (j == 0 && i == 16) {
            textView1.setText(" 킹콩부대찌개 우삼겹부대찌개 8000원");
            return;
        }
        if (j == 0 && i == 17) {
            textView1.setText("뚝닭 눈꽃치순 14000원");
            return;
        }
        if (j == 0 && i == 18) {
            textView1.setText(" 엉터리생고기 삼겹살무한리필 10000원");
            return;
        }
        if (j == 0 && i == 19) {
            textView1.setText("쪼계찜닭 순살치즈찜닭 20000원");
            return;
        }
        if (j == 0 && i == 20) {
            textView1.setText(" 쪼계찜닭 쪼계찜닭 16000원");
            return;
        }
        if (j == 1 && i == 1) {
            textView1.setText("꼬밥 구운만두 2000원");
            return;
        }
        if (j == 1 && i == 2) {
            textView1.setText(" 디델리 불갈비만두 3000원");
            return;
        }
        if (j == 1 && i == 3) {
            textView1.setText("남경 짜장면 4000원");
            return;
        }
        if (j == 1 && i == 4) {
            textView1.setText(" 신신원 짜장면 4000원");
            return;
        } if (j == 1 && i == 5) {
            textView1.setText("홍콩반점 짜장면 4000원");
            return;
        }
        if (j == 1 && i == 6) {
            textView1.setText(" 홍콩반점 짬뽕 4500원");
            return;
        }
        if (j == 1 && i == 7) {
            textView1.setText("대성원 짬뽕 4500원 현금");
            return;
        }
        if (j == 1 && i == 8) {
            textView1.setText("남경 짬뽕 5000원");
            return;
        }
        if (j == 1 && i == 9) {
            textView1.setText(" 남경 잡채밥 6000원");
            return;
        }
        if (j == 1 && i == 10) {
            textView1.setText("대성원 쟁반짜장1인 - 6500원");
            return;
        }
        if (j == 1 && i == 11) {
            textView1.setText(" 신신원 소고기우육면 6000원");
            return;
        }
        if (j == 1 && i == 12) {
            textView1.setText("신신원 소고기우육면 6000원");
            return;
        }
        if (j == 1 && i == 13) {
            textView1.setText(" 홍콩반점 탕수육소 - 9500원");
            return;
        }
        if (j == 1 && i == 14) {
            textView1.setText("대성원 새우볶음밥 8000원");
            return;
        }
        if (j == 1 && i == 15) {
            textView1.setText(" 대성원 특밥 8000원");
            return;
        }
        if (j == 1 && i == 16) {
            textView1.setText("홍콩반점 탕수육소 - 9500원");
            return;
        }
        if (j == 1 && i == 17) {
            textView1.setText(" 신신원 양꼬치 10000원");
            return;
        }
        if (j == 1 && i == 18) {
            textView1.setText("남경 탕수육소 - 13000원");
            return;
        }
        if (j == 1 && i == 19) {
            textView1.setText(" 대성원 탕수육소 - 13000원");
            return;
        }
        if (j == 1 && i == 20) {
            textView1.setText("신신원 탕수육 15000원");
            return;
        }
        if (j == 2 && i == 1) {
            textView1.setText(" 역전우동410 - 김치우동 3500원");
            return;
        }
        if (j == 2 && i == 2) {
            textView1.setText("역전우동410 - 불만두 3500원");
            return;
        }
        if (j == 2 && i == 3) {
            textView1.setText(" 역전우동410 - 옛날우동 3000원");
            return;
        }
        if (j == 2 && i == 4) {
            textView1.setText("역전우동410 - 치킨미니덮밥 3000원");
            return;
        }
        if (j == 2 && i == 5) {
            textView1.setText(" 산바쿠돈부리 카레라이스 5000원");
            return;
        }
        if (j == 2 && i == 6) {
            textView1.setText("역전우동410 - 오뎅우동 4000원");
            return;
        }
        if (j == 2 && i == 7) {
            textView1.setText(" 코바코 코바코우동 4000원");
            return;
        }
        if (j == 2 && i == 8) {
            textView1.setText("코바코 크래미날치롤 5000원");
            return;
        }
        if (j == 2 && i == 9) {
            textView1.setText("1퍼센트 돈코츠라멘 6000원");
            return;
        }
        if (j == 2 && i == 10) {
            textView1.setText("산바쿠돈부리 가츠동 6000원");
            return;
        }
        if (j == 2 && i == 11) {
            textView1.setText(" 삼복가 수제왕돈까스 7000원");
            return;
        }
        if (j == 2 && i == 12) {
            textView1.setText("코바코 냉메밀 6000원");
            return;
        }
        if (j == 2 && i == 13) {
            textView1.setText("1퍼센트 카츠카레 8000원");
            return;
        }
        if (j == 2 && i == 14) {
            textView1.setText("사조회참치 회덮밥 8000원");
            return;
        }
        if (j == 2 && i == 15) {
            textView1.setText(" 삼복가 치즈돈까스 8000원");
            return;
        }
        if (j == 2 && i == 16) {
            textView1.setText("스시마리오 알탕 8000원");
            return;
        }
        if (j == 2 && i == 17) {
            textView1.setText("1퍼센트 연어광어초밥 12000원");
            return;
        }
        if (j == 2 && i == 18) {
            textView1.setText("사조회참치 초밥 15000원");
            return;
        }
        if (j == 2 && i == 19) {
            textView1.setText(" 산바쿠돈부리 산바쿠동② 14000원");
            return;
        }
        if (j == 2 && i == 20) {
            textView1.setText("스시마리오 마리오모듬스시10pcs) - 10000원");
            return;
        }
        if (j == 3 && i == 1) {
            textView1.setText(" 맘스터치 - 싸이버거단품 3200원");
            return;
        }
        if (j == 3 && i == 2) {
            textView1.setText("맘스터치-  할라피뇨통살단품 3700원");
            return;
        }
        if (j == 3 && i == 3) {
            textView1.setText(" 파리바게트 바베큐치킨로스티 2000원");
            return;
        }
        if (j == 3 && i == 4) {
            textView1.setText("할리스커피 크로무슈 3900원");
            return;
        }
        if (j == 3 && i == 5) {
            textView1.setText(" pocapoca - 갈릭다핑김치베이컨고구마 5300원");
            return;
        }
        if (j == 3 && i == 6) {
            textView1.setText("즉석김밥 오므라이스 5000원");
            return;
        }
        if (j == 3 && i == 7) {
            textView1.setText(" 가대돈스 새우로제파스타 5900원");
            return;
        }
        if (j == 3 && i == 8) {
            textView1.setText("pocapoca - 어니언딥칠리새우 5300원");
            return;
        }
        if (j == 3 && i == 9) {
            textView1.setText(" 꿈꾸는다락방 버섯크림파스타 7000원");
            return;
        }
        if (j == 3 && i == 10) {
            textView1.setText("꿈꾸는다락방 올리브갈릭파스타 7000원");
            return;
        }
        if (j == 3 && i == 11) {
            textView1.setText(" 은행나무 로제파스타 7500원");
            return;
        }
        if (j == 3 && i == 12) {
            textView1.setText("할리스커피 머쉬룸스프볼 6900원");
            return;
        }
        if (j == 3 && i == 13) {
            textView1.setText(" FusionJapanesedining - 크림고로케 9900원");
            return;
        }
        if (j == 3 && i == 14) {
            textView1.setText("은행나무 해물알리오올리오파스타 9500원");
            return;
        }
        if (j == 3 && i == 15) {
            textView1.setText(" 은행나무 해물크림스파이시파스타 9900원");
            return;
        }
        if (j == 3 && i == 16) {
            textView1.setText("은행나무 해물토마토스파이시파스타 9500원");
            return;
        }
        if (j == 3 && i == 17) {
            textView1.setText(" V떡볶이 고르곤졸라맛있는피자 11900원");
            return;
        }
        if (j == 3 && i == 18) {
            textView1.setText("피자마루 리얼BQ 시카고피자 17900원");
            return;
        }
        if (j == 3 && i == 19) {
            textView1.setText(" 피자마루 리얼오리지널시카고피자 14900원");
            return;
        }
        if (j == 3 && i == 20) {
            textView1.setText("피자마루 치즈마니아오리지널시카고피자 14900원");
            return;
        }
        if (j == 4 && i == 1) {
            textView1.setText(" 가톨릭대학생회관미쉘식당 라면 1500원");
            return;
        }
        if (j == 4 && i == 2) {
            textView1.setText("모노크림치즈 그릴드치즈8가지맛 - 2000~3300원");
            return;
        }
        if (j == 4 && i == 3) {
            textView1.setText(" 모노크림치즈 크림치즈홀10가지맛 - 3500원");
            return;
        }
        if (j == 4 && i == 4) {
            textView1.setText("승록이네별난떡볶이 매콤r달콤r별난떡볶이인분매운맛,2,3단계 - 3500원");
            return;
        }
        if (j == 4 && i == 5) {
            textView1.setText(" 디델리라볶이");
            return;
        }
        if (j == 4 && i == 6) {
            textView1.setText("모노크림치즈 파니니4가지맛 - 4300~4900원");
            return;
        }
        if (j == 4 && i == 7) {
            textView1.setText(" 학교가는길 라볶이스페셜라볶이계⬂개만ଢ개 - 4000원");
            return;
        }
        if (j == 4 && i == 8) {
            textView1.setText("호미마루 쫄면 4500원");
            return;
        }
        if (j == 4 && i == 9) {
            textView1.setText(" 달콤한닭강정 닭강정반마리3가지맛 - 7000원");
            return;
        }
        if (j == 4 && i == 10) {
            textView1.setText("브이떡볶이 외계침공오징어튀김 6000원");
            return;
        }
        if (j == 4 && i == 11) {
            textView1.setText(" 신림동순대타운 백순대볶음 7000원");
            return;
        }
        if (j == 4 && i == 12) {
            textView1.setText("신전떡볶이 떡볶이튀김오뎅6)+만두5)+김말이3) - 6500원");
            return;
        }
        if (j == 4 && i == 13) {
            textView1.setText(" 버블몬 크림카레우동 8000원");
            return;
        }
        if (j == 4 && i == 14) {
            textView1.setText("승록이네별난떡볶이 A셋트매콤r달콤r별난떡볶이튀김 - 9500원");
            return;
        }
        if (j == 4 && i == 15) {
            textView1.setText(" 승록이네별난떡볶이 B셋트매콤r달콤r별난떡볶이날치알김가루밥쿨피스 - 9000원");
            return;
        }
        if (j == 4 && i == 16) {
            textView1.setText("장터치킨 후라이드치킨 9000원");
            return;
        }
        if (j == 4 && i == 17) {
            textView1.setText(" 굿쌀치킨 굿쌀오븐베이크치킨 16900원");
            return;
        }
        if (j == 4 && i == 18) {
            textView1.setText("브이떡볶이 즉석떡볶이2인 - 11900원");
            return;
        }
        if (j == 4 && i == 19) {
            textView1.setText(" BBQ - 황금올리브후라이드치킨 18000원");
            return;
        }
        if (j == 4 && i == 20) {
            textView1.setText("썬더치킨 간장반후라이드반 13000원");
            return;
        }
    }
}