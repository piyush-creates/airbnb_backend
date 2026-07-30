# 🏨 Airbnb Backend Clone

A production-ready backend for an Airbnb-style hotel booking platform built using **Spring Boot**. The application provides secure authentication, hotel management, room booking, Stripe payment integration, and role-based authorization.

---

## 🚀 Live Demo

- **API Base URL:** https://hotel-book.up.railway.app/api/v1
- **Swagger UI:** https://hotel-book.up.railway.app/api/v1/swagger-ui/index.html

---

# ✨ Features

### 🔐 Authentication & Authorization
- User Registration
- User Login
- JWT Authentication
- Role-Based Authorization
- BCrypt Password Encryption
- Stateless Authentication

### 👤 User Features
- Register/Login
- View Hotels
- View Rooms
- Create Booking
- Cancel Booking
- View Booking History

### 🏨 Hotel Manager Features
- Add Hotel
- Update Hotel
- Delete Hotel
- Add Rooms
- Update Room Details
- Manage Inventory

### 📅 Booking Features
- Check Room Availability
- Create Booking
- Guest Management
- Booking Expiration
- Booking Cancellation

### 💳 Stripe Integration
- Stripe Checkout Session
- Secure Webhook Verification
- Automatic Payment Capture
- Booking Confirmation after Successful Payment

### 📖 API Documentation
- Interactive Swagger UI
- OpenAPI Documentation

---

# 🛠 Tech Stack

## Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate

## Database
- PostgreSQL

## Authentication
- JWT (JSON Web Token)

## Payment Gateway
- Stripe Checkout
- Stripe Webhooks

## API Documentation
- Swagger (SpringDoc OpenAPI)

## Deployment
- Railway

## Build Tool
- Maven

---

# 🏗 Project Architecture

```
Client
      │
      ▼
Spring Boot REST API
      │
 ├── Spring Security (JWT)
 ├── Controllers
 ├── Services
 ├── Repositories
 ├── PostgreSQL
 └── Stripe API
```

---

# 📂 Project Structure

```
src
├── controller
├── service
├── repository
├── entity
├── dto
├── security
├── config
├── exception
└── util
```

---

# 🔑 API Endpoints

## Authentication

| Method | Endpoint |
|----------|------------------------------|
| POST | /auth/signup |
| POST | /auth/login |

---

## Hotels

| Method | Endpoint |
|----------|------------------------------|
| GET | /hotels |
| GET | /hotels/{id} |
| POST | /admin/hotels |
| PUT | /admin/hotels/{id} |
| DELETE | /admin/hotels/{id} |

---

## Rooms

| Method | Endpoint |
|----------|------------------------------|
| POST | /admin/rooms |
| PUT | /admin/rooms/{id} |
| DELETE | /admin/rooms/{id} |

---

## Bookings

| Method | Endpoint |
|----------|------------------------------|
| POST | /bookings/init |
| POST | /bookings/{id}/payment |
| GET | /bookings/my-bookings |
| DELETE | /bookings/{id} |

---

## Webhook

| Method | Endpoint |
|----------|------------------------------|
| POST | /webhook/payment |

---

# 🔒 Security

- JWT Authentication
- BCrypt Password Encoding
- Stateless Sessions
- Role-Based Authorization
- Stripe Webhook Signature Verification

---

# ⚙ Environment Variables

Create the following environment variables:

```properties
PORT=

PGHOST=
PGPORT=
PGDATABASE=
PGUSER=
PGPASSWORD=

JWT_SECRET=

STRIPE_SECRET_KEY=
STRIPE_WEBHOOK_SECRET=

FRONTEND_URL=
```

---

# 🚀 Running Locally

### Clone Repository

```bash
git clone https://github.com/piyush-creates/airbnb_backend.git
```

### Navigate

```bash
cd airbnb_backend
```

### Configure Environment Variables

Update `application.properties` or configure environment variables.

### Run

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

# 📷 Screenshots

## Swagger UI
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/a35f4026-7530-46e4-aec6-e07f9c7c3bbd" />
---

## Railway Deployment

<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/bca34a32-63fe-48c4-8e65-33730db5d58b" />


---

## Stripe Checkout

<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/d00e56b1-3cfa-4d0f-a9f9-cac38e3ab890" />


---

# Future Improvements

- Email Notifications
- Redis Caching
- Docker Support
- CI/CD Pipeline
- AWS S3 Image Upload
- Elasticsearch
- Rate Limiting

---

# 👨‍💻 Author

**Piyush Kumar**

GitHub:
https://github.com/piyush-creates

LinkedIn:
linkedin.com/in/piyush-creates/

---

# ⭐ If you like this project

Give this repository a ⭐ on GitHub.
