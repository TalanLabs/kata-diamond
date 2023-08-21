# Diamond

## Instructions

Le kata `diamant` prend en entrée une lettre et la sort dans un diamant
forme. Étant donné une lettre, il imprime un diamant commençant par `'A'`, avec le
lettre fournie au point le plus large.

## Requirements

- La première ligne contient un `'A'`.
- La dernière ligne contient un `'A'`.
- Toutes les lignes, sauf la première et la dernière, ont exactement deux lettres identiques.
- Toutes les lignes ont autant d'espaces de fin que d'espaces de début. (Cela pourrait être 0).
- Le diamant est symétrique horizontalement.
- Le diamant est à symétrie verticale.
- Le diamant a une forme carrée (largeur égale hauteur).
- Les lettres forment un losange.
- La moitié supérieure a les lettres dans l'ordre croissant.
- La moitié inférieure a les lettres dans l'ordre décroissant.
- Les quatre coins (contenant les espaces) sont des triangles.

## Exemples

Dans les exemples suivants, les espaces sont indiqués par des caractères `·`.

Diamant `'A'`:

```text
A
```

Diamant `'C'`:

```text
··A··
·B·B·
C···C
·B·B·
··A··
```

Diamant `'C'`:

```text
····A····
···B·B···
··C···C··
·D·····D·
E·······E
·D·····D·
··C···C··
···B·B···
····A····
```

### Based on

Seb Rose - http://claysnow.co.uk/recycling-tests-in-tdd/
