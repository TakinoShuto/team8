import greenfoot.*;  // Greenfootの基本クラスをインポート

public class MyWorld extends World
{
    private int count=0;
    D d=new D();
    public MyWorld() 
    {    
        // 画面サイズを設定 (横幅600px、縦幅400px)
        super(600, 400, 1); 
        
        // 背景画像を設定
        GreenfootImage backgroundImage = new GreenfootImage("background.png");  // 背景画像を読み込む
        backgroundImage.scale(getWidth(), getHeight());  // 画面サイズにリサイズ
        backgroundImage.setTransparency(255);
        setBackground(backgroundImage);  // リサイズされた画像を背景として設定

        A a = new A();// 生徒アクターを世界に追加
        addObject(a,300,350);
        
        k k = new k();// 玉アクターを世界に追加
        addObject(k,300,360);
        
        addObject(new D(),200,0);
        
        
        
    }
    public void act(){
        if(count>=50){
            int C = 0+(int)(Math.random()*(800-0)+1);
            addObject(d,C,0);
            count=0;
    }
    count = count+1;
}
}
