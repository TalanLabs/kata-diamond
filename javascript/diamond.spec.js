import { drawDiamond } from './diamond'

describe('draw diamond', () => {
  test('letter A', () => {
    expect(drawDiamond('A')).toEqual(['A'])
  })

  test('letter B', () => {
    const expected = [
      ' A ',
      'B B',
      ' A ']
    expect(drawDiamond('B')).toEqual(expected)
  })

  test('letter C', () => {
    const expected = [
      '  A  ',
      ' B B ',
      'C   C',
      ' B B ',
      '  A  ']
    expect(drawDiamond('C')).toEqual(expected)
  })

  test('letter D', () => {
    const expected = [
      '   A   ',
      '  B B  ',
      ' C   C ',
      'D     D',
      ' C   C ',
      '  B B  ',
      '   A   ']
    expect(drawDiamond('D')).toEqual(expected)
  })

  test('letter Z', () => {
    const expected = [
      '                         A                         ',
      '                        B B                        ',
      '                       C   C                       ',
      '                      D     D                      ',
      '                     E       E                     ',
      '                    F         F                    ',
      '                   G           G                   ',
      '                  H             H                  ',
      '                 I               I                 ',
      '                J                 J                ',
      '               K                   K               ',
      '              L                     L              ',
      '             M                       M             ',
      '            N                         N            ',
      '           O                           O           ',
      '          P                             P          ',
      '         Q                               Q         ',
      '        R                                 R        ',
      '       S                                   S       ',
      '      T                                     T      ',
      '     U                                       U     ',
      '    V                                         V    ',
      '   W                                           W   ',
      '  X                                             X  ',
      ' Y                                               Y ',
      'Z                                                 Z',
      ' Y                                               Y ',
      '  X                                             X  ',
      '   W                                           W   ',
      '    V                                         V    ',
      '     U                                       U     ',
      '      T                                     T      ',
      '       S                                   S       ',
      '        R                                 R        ',
      '         Q                               Q         ',
      '          P                             P          ',
      '           O                           O           ',
      '            N                         N            ',
      '             M                       M             ',
      '              L                     L              ',
      '               K                   K               ',
      '                J                 J                ',
      '                 I               I                 ',
      '                  H             H                  ',
      '                   G           G                   ',
      '                    F         F                    ',
      '                     E       E                     ',
      '                      D     D                      ',
      '                       C   C                       ',
      '                        B B                        ',
      '                         A                         '
    ]
    expect(drawDiamond('Z')).toEqual(expected)
  })
})
