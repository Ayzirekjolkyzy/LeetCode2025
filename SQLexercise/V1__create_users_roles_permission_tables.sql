-- Создание таблицы Roles
CREATE TABLE Roles (
    role_id INT PRIMARY KEY,
    role_name VARCHAR(255) NOT NULL
);


-- Создание таблицы Permissions
CREATE TABLE Permissions (
    permission_id INT PRIMARY KEY,
    permission_name VARCHAR(255) NOT NULL
);


-- Создание таблицы RolePermissionsAssociation
CREATE TABLE RolePermissionsAssociation (
    role_permission_id INT PRIMARY KEY,
    role_id INT NOT NULL,
    permission_id INT NOT NULL,
    FOREIGN KEY (role_id) REFERENCES Roles(role_id),
    FOREIGN KEY (permission_id) REFERENCES Permissions(permission_id)
);

-- Создание таблицы users
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role_id INT NOT NULL,
    birth_date DATETIME,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    gender ENUM('male', 'female', 'none'),
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    is_blocked BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (role_id) REFERENCES Roles(role_id)
);
