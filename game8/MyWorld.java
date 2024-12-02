import greenfoot.*;  // Greenfootの基本クラスをインポート

public class MyWorld extends World
{
    public MyWorld() 
    {    
        // 画面サイズを設定 (横幅600px、縦幅400px)
        super(600, 400, 1); 
        
        // 背景画像を設定
        GreenfootImage backgroundImage = new GreenfootImage("background.png");  // 背景画像を読み込む
        backgroundImage.scale(getWidth(), getHeight());  // 画面サイズにリサイズ
        setBackground(backgroundImage);  // リサイズされた画像を背景として設定

        A a = new A();// 生徒アクターを世界に追加
        addObject(a,300,100);
    }
}
