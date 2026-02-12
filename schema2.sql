CREATE TABLE categories (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE addresses (
    id INT NOT NULL AUTO_INCREMENT,
    unit_number VARCHAR(20),
    street_number VARCHAR(20),
    street_name VARCHAR(255),
    suburb VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    postal_code VARCHAR(20),
    country VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE university (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
        ON DELETE SET NULL
);

CREATE TABLE teachers (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    dob DATE,
    address_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
        ON DELETE SET NULL
);

CREATE TABLE students (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    dob DATE,
    address_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
        ON DELETE SET NULL
);

CREATE TABLE subjects (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    university_id INT NOT NULL,
    category_id INT,
    teacher_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (university_id) REFERENCES university(id)
        ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES categories(id)
        ON DELETE SET NULL,
    FOREIGN KEY (teacher_id) REFERENCES teachers(id)
        ON DELETE SET NULL
);

CREATE TABLE subject_enrollments (
    subject_id INT NOT NULL,
    student_id INT NOT NULL,
    PRIMARY KEY (subject_id, student_id),
    FOREIGN KEY (subject_id) REFERENCES subjects(id)
        ON DELETE CASCADE,
    FOREIGN KEY (student_id) REFERENCES students(id)
        ON DELETE CASCADE
);
