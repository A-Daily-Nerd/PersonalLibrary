# 📚 spensmer

[![Java](https://img.shields.io/badge/Java-11%2B-blue)]()
[![License](https://img.shields.io/badge/license-MIT-green)]()

A lightweight Java library providing utilities for **2D arrays, grids, points, and numerical operations**.  
It simplifies working with multidimensional data and includes abstractions for iteration, mapping, and math-based transformations.

---

## ✨ Features
- Generic **2D array wrapper** with intuitive methods
- **Point** abstraction with typed coordinates
- **Grid** utilities for elementwise operations
- Easy integration with Java functional interfaces (`BiConsumer`, `Function`, etc.)

---

## Usage
All classes besides Array2d are generics limited to \<T extends Number\>

### Array2d
- Contructor takes (ComponentType, width, height, fillValue) usage looks like:
Array2d<type> a = new Array2d<>(type.class,4,4, null);
- getValue(Point<Integer> a) gets the value of point a in the array
- setValue

---

## 📦 Installation

Clone the repository and include the `spensmer` package in your project:

```bash
git clone https://github.com/A-Daily-Nerd/PersonalLibrary.git

