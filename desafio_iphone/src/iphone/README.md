# 📱 Desafio de POO: Componente iPhone (DIO)

Este projeto foi desenvolvido como parte do desafio de Programação Orientada a Objetos (POO) da DIO, com base no vídeo de lançamento do iPhone em 2007. O objetivo é representar o comportamento do dispositivo por meio de classes e interfaces Java, modelando funcionalidades como reprodutor musical, aparelho telefônico e navegador de internet.

---

## 🔧 Funcionalidades

O componente `Iphone` implementa três comportamentos distintos:

### 🎵 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador de Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## 📐 Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
