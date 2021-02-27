# 開発環境説明

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

//インスペクション
docker-compose exec java bash

//コンパイル
javavc Main.java

//実行
java Main
```
