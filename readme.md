# 開発環境説明

https://qiita.com/A-Kira/items/0dda255e00771f556e2a

├── docker
│   └── java
│       └── Dockerfile
├── docker-compose.yml
└── server
    └── src
        ├── Main.class
        └── Main.java

1. dockerの起動

```bash
//dockerをバックグラウンドで起動
docker-compose up -d

//確認
docker-compose ps

//dockerコンテナを落とす
docker-compose down

//インスペクション(実行したい場合はサーバーに入る)
docker-compose exec java bash

//コンパイル
javavc Main.java

//実行
java Main

//コンテナから出る
exit

```
