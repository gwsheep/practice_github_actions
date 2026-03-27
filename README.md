# CI/CD Practice (2026.03)

## 주제
- GitHub Actions를 활용한 간단한 EC2 자동 배포 실습

## 목적
- CI/CD 기본 흐름 이해
- GitHub Actions Workflow 작성 경험
- EC2 원격 배포 방식 익히기
- Secret 기반 환경변수 주입 방식 학습

## 기술 스택
![GitHubActions](https://img.shields.io/badge/GitHub_Actions-CI%2FCD-blue)
![EC2](https://img.shields.io/badge/AWS_EC2-orange)

## 구조
GitHub Push → GitHub Actions → SSH → EC2 → Build → Run

## 주요 구현 내용
- main 브랜치 push 시 배포 workflow 실행
- GitHub Secrets를 이용한 EC2 접속 정보 관리
- SSH를 통해 원격 서버 접속
