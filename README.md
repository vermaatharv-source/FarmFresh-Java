<div align="center">

# 🌾 FarmFresh — Java Edition

### Cultivating a direct, transparent bridge between farmers and consumers.

*A console-based, OOP-driven marketplace engine — built in core Java, powered by MongoDB.*

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![MongoDB](https://img.shields.io/badge/MongoDB-Atlas-47A248?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/atlas)
[![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Status](https://img.shields.io/badge/Status-In%20Development-FFB800?style=for-the-badge)]()
[![License](https://img.shields.io/badge/License-Academic-blue?style=for-the-badge)]()

<br/>

[Overview](#-overview) •
[Problem](#-the-problem) •
[Features](#-features) •
[Architecture](#%EF%B8%8F-architecture) •
[Tech Stack](#%EF%B8%8F-tech-stack) •
[Setup](#-getting-started) •
[Team](#-team)

</div>

<br/>

---

## 📖 Overview

**FarmFresh (Java)** is a re-engineered, backend-first take on the FarmFresh marketplace concept — stripped down to its architectural core. Where the original is a full-stack MERN web app, this edition demonstrates the same real-world business logic through **pure object-oriented Java**, backed by **MongoDB** for persistence.

Built as a group project for our Data Structures & OOP coursework, this isn't a toy CRUD app — it's a layered system modeling real marketplace behavior: role-based users, live inventory, order fulfillment, and trending-product analytics, all running through a clean console interface.

<br/>

## 🎯 The Problem

Indian agriculture is bottlenecked by intermediaries. Between the farmer and the final buyer sits a chain of mandis, aggregators, and distributors — each layer adding markup, delay, and opacity.

| Who | What they lose |
|---|---|
| 🧑‍🌾 **Farmers** | Undercut on price, no visibility into real demand, no direct buyer relationships |
| 🛒 **Consumers** | Inflated prices, no traceability, no idea how fresh produce actually is |

**FarmFresh removes the middle layer entirely** — connecting the two sides directly, with real inventory logic and order integrity underneath.

<br/>

## ✨ Features

- 👤 **Dual-Role System** — Distinct `Farmer` and `Consumer` entities with role-specific capabilities
- 📦 **Live Product Listings** — Farmers list, update, and manage stock in real time
- 🛒 **Direct Ordering** — Consumers browse and order straight from the source
- 📊 **Trending Engine** — Aggregation-driven logic surfaces high-demand produce
- 🗄️ **Persistent Storage** — Every transaction backed by MongoDB Atlas
- 🏗️ **Layered, Testable Architecture** — Strict separation across Model → Repository → Service

<br/>

## 🏛️ Architecture

```
FarmFresh-Java/
├── src/main/java/com/farmfresh/
│   ├── models/           → User, Farmer, Consumer, Product, Order
│   ├── db/                → MongoConnection
│   ├── repository/        → FarmerRepo, ProductRepo, ConsumerRepo, OrderRepo
│   ├── service/            → ProductService, OrderService, TrendingService
│   ├── exception/          → Custom domain exceptions
│   └── Main.java           → Entry point
├── pom.xml
└── README.md
```

> Every layer talks only to the layer directly beneath it — Models stay dumb, Repositories own persistence, Services own logic. No shortcuts.

<br/>

## 🛠️ Tech Stack

<div align="center">

| Layer | Technology |
|:---:|:---:|
| **Language** | Java 17 |
| **Database** | MongoDB Atlas |
| **Build Tool** | Maven |
| **Driver** | MongoDB Java Driver |
| **Paradigm** | Object-Oriented, Layered Architecture |

</div>

<br/>

## 🚀 Getting Started

### Prerequisites
- JDK 17+
- Maven
- A MongoDB Atlas cluster (or local MongoDB instance)

### Installation

```bash
# 1. Clone the repository
git clone https://github.com/vermaatharv-source/FarmFresh-Java.git
cd FarmFresh-Java

# 2. Configure your database connection
export MONGO_URI="your_mongodb_connection_string"

# 3. Compile and run
mvn compile exec:java
```

<br/>

## 👥 Team

<div align="center">

| Member | Ownership |
|---|---|
| **Atharv Verma** | Models, MongoConnection, Build Setup |
| **Shaurya Rai** | Farmer & Product Repositories, Product Service |
| **Ayush** | Consumer & Order Repositories, Order Service |
| **Retvij Srivastav** | Main, Trending Service, Exceptions, Testing |

</div>

<br/>

---

<div align="center">

*Built with ☕ and OOP discipline, as a college mini project.*

</div>
