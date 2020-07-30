new Vue({
    el : '#app',
    data : {
        playerHealth : 100,
        monsterHealth : 100,
        gameIsRunning : false,
        turns : []
    },
    methods : {
        /* startGame
         * 1) playerHealth , monsterHealth , 이력 초기화 
         * 2) 게임 시작을 위한 gameIsRunning 값 변경 
         */
        startGame : function(){
            this.playerHealth = 100;
            this.monsterHealth = 100;
            this.gameIsRunning = true;
            this.turns = [];
            
        },
        /*
         * monster, player에게 랜덤으로 데미지를 주도록 구현한다.
         * Math.floor() : 소수점 이하를 버림한다.
         * Math.ceil()  : 소수점 이하를 올림한다.
         * Math.round() : 소수점 이하를 반올림한다.
         */

        /*  
         * attack
         * 1) monster 데미지 입히기 (min: 3 , max: 10)
         * 2) 이력 생성
         *    text : 'Player hits Monster for ' + damage
         * 3) 승자 여부 체크 
         * 4) monster의 공격 
         */
        attack : function(){
            var damage = this.calculateDamage(3,10);
            this.monsterHealth -=damage;
            if (this.monsterHealth < 0) {
                this.monsterHealth = 0
            }
            this.turns.unshift({
                isPlayer: true,
                text: 'Player hits Monster for ' + damage
            });
            if(this.checkWin()){
                return;
            }

            this.monsterAttak();            
            
        },

        /**
		 * specialAttack
         * 1) monster 데미지 입히기 (min : 10 , max: 20)
         * 2) 이력 생성 
		      text : 'Player hits Monster hard for ' + damage
         * 3) 승자 여부 체크
         * 4) monster의 공격
         */
        specialAttack : function(){
            var damage = this.calculateDamage(10, 20);
            this.monsterHealth -= damage;
            if(this.monsterHealth<0){
                this.monsterHealth = 0
            }
            this.turns.unshift({
                isPlayer: true,
                text: 'Player hits Monster hard for ' + damage
            });
            if (this.checkWin()){
                return;
            }
            

            this.monsterAttak();

        },

        /**
         * heal
         * 1) player 체력 회복
         *    - playerHealth + 10 하되 100을 넘기지 않아야 한다.
		 * 2) 이력 생성
		 *    text : 'Player heals for 10'
         * 3) monster의 공격
         */
        heal : function(){
            if(this.playerHealth <=90){
                this.playerHealth +=10;
            }else{
                this.playerHealth = 100;
            }
            this.turns.unshift({
                isPlayer : true,
                text: 'Player heals for 10'
            });

            this.monsterAttak();
        },

        /* 
         * giveUp
         * gameIsRunning 초기화 
         */
        giveUp : function(){
            this.gameIsRunning  = false;        
        },

        /*
		 * monsterAttacks
         * 1) player 데미지 입히기 (min: 5 , max: 12)
         * 2) 승자 여부 체크
         * 3) 이력 생성
         *    text : 'Monster hits Player for ' + damage
         */
        monsterAttak : function(){
            var damage = this.calculateDamage(5, 12);
            this.playerHealth -= damage;
            if (this.playerHealth < 0) {
                this.playerHealth = 0
            }
            this.turns.unshift({
                isPlayer: false,
                text: 'Monster hits Player for ' + damage
            });
            if (this.checkWin()){
                return;
            }
            

        },

        /*
         * Damage를 random으로 계산한다.
         */
        calculateDamage : function(min, max){
            return Math.max(Math.floor(Math.random()*max)+1,min);
        },

        /*
         * checkWin
         * confirm() method 사용해서 승자를 알려주고 재시작할지 여부를 묻는다.  
         */
        checkWin : function(){
            //monsterHealth가 0이하일때 팝업창('You won!') 띄우고 게임상태와 log 초기화
            if(this.monsterHealth<=0){
                if(confirm("You won! newGame??")){
                    this.startGame();
                    
                }else{
                    this.gameIsRunning = false;                    
                }
                return true;
            }else if(this.playerHealth<=0){
            //playerHealth가 0이하일때 팝업창('You lost!') 띄우고 게임상태와 log 초기화
                if (confirm("You lost! newGame??")) {
                    this.startGame();
                    
                } else {
                    this.gameIsRunning = false;

                }
                return true;
            }else{
                return false;
            }
  
           
        }
    }
})
